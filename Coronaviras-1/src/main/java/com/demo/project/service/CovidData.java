package com.demo.project.service;

import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.demo.project.DTO.Covid;

@Service
public class CovidData 
{
	private List<Covid> alldate=new ArrayList<Covid>();
	
	
	public List<Covid> getAlldate() 
	{
		return alldate;
	}
	public void setAlldate(List<Covid> alldate) 
	{
		this.alldate = alldate;
	}

	private static String COVID_DATA_URL="https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_deaths_global.csv";
    @PostConstruct
	@Scheduled(cron = "* * * 1 * *")
     public void allDateRecover() throws IOException, InterruptedException
     {
    	 List<Covid> newl1=new ArrayList<Covid>();
    	 HttpClient client=HttpClient.newHttpClient();
    	 HttpRequest req=HttpRequest.newBuilder().uri(URI.create(COVID_DATA_URL)).build();
    	 HttpResponse<String>ros=client.send(req, HttpResponse.BodyHandlers.ofString());
    	 
    	 StringReader csvReader = new StringReader(ros.body());
    	 Iterable<CSVRecord> records=CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvReader);
    	 
    	 for(CSVRecord rec : records)
    	 {
    		 Covid losta=new Covid();
    		 losta.setState(rec.get("Province/State"));
    		 losta.setCountry(rec.get("Country/Region"));
    		 int latestCase=Integer.parseInt(rec.get(rec.size()-1));
    		 int PrevCase=Integer.parseInt(rec.get(rec.size()-2));
    		 losta.setLatestTotalDeaths(latestCase);
    		 losta.setDifferFromPrevay(latestCase-PrevCase);
    		 
    		 System.out.println(losta);
    		 newl1.add(losta);
    		 
    	 }
    	 this.alldate=newl1;
     }
}
