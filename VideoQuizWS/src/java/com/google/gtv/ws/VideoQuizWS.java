/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.gtv.ws;

import com.google.gson.Gson;
import com.google.gtv.Answer;
import com.google.gtv.Question;
import com.google.gtv.Video;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author Armel
 */
@Path("/videos")
public class VideoQuizWS {

    @Context
    private UriInfo context;
    private static List<Video> videos;

    /**
     * Retrieves representation of an instance of com.google.gtv.ws.VideoQuizWS
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public static String getVideoQuiz() {
        init();
        Gson gson = new Gson();

        return gson.toJson(videos);
    }

     public static void init() {
         
        if (videos == null) {
           
                final Video video = new Video(URLEncoder.encode("http://www.videodetective.net/player.aspx?cmd=6&fmt=4&customerid=699923&videokbrate=2500&publishedid=284873"), 
                        new Question("Where is Nicki Minaj from?", new ArrayList<Answer>() {

                    {
                        add(new Answer("USA", Boolean.FALSE));
                        add(new Answer("Trinidad and Tobago", Boolean.TRUE));
                        add(new Answer("Jamaica", Boolean.FALSE));
                        add(new Answer("England", Boolean.FALSE));
                    }
                }));

                final Video video2 = new Video("http://www.videodetective.net/player.aspx?cmd=6&fmt=4&customerid=699923&videokbrate=2500&publishedid=735896",
                        new Question("Which movie did the name \"Dynamite Hack\" come from?", new ArrayList<Answer>() {

                    {
                        add(new Answer("2 Fast 2 Furious", Boolean.FALSE));
                        add(new Answer("Pineaple Express", Boolean.FALSE));
                        add(new Answer("Caddyshack", Boolean.TRUE));
                        add(new Answer("Hackers", Boolean.FALSE));
                    }
                }));
                
                final Video video3 = new Video("http://www.videodetective.net/player.aspx?cmd=6&fmt=4&customerid=699923&videokbrate=2500&publishedid=145147",
                        new Question("Who is Selena Gomez dating?", new ArrayList<Answer>() {

                    {
                        add(new Answer("Eminen", Boolean.FALSE));
                        add(new Answer("Michael Douglas", Boolean.FALSE));
                        add(new Answer("Just Bieber", Boolean.TRUE));
                        add(new Answer("Justin Timberlake", Boolean.FALSE));
                    }
                }));
                
                final Video video4 = new Video("http://www.videodetective.net/player.aspx?cmd=6&fmt=4&customerid=699923&videokbrate=2500&publishedid=573218",
                        new Question("When was the group \"Panic at the disco\" founded?", new ArrayList<Answer>() {

                    {
                        add(new Answer("Las Vegas", Boolean.TRUE));
                        add(new Answer("New York", Boolean.FALSE));
                        add(new Answer("Nashville", Boolean.TRUE));
                        add(new Answer("San Franscico", Boolean.FALSE));
                    }
                }));
                
                final Video video5 = new Video("http://www.videodetective.net/player.aspx?cmd=6&fmt=4&customerid=699923&videokbrate=2500&publishedid=499478",
                        new Question("How many band members are there in \"Theory of a deadman\"?", new ArrayList<Answer>() {

                    {
                        add(new Answer("8", Boolean.FALSE));
                        add(new Answer("4", Boolean.TRUE));
                        add(new Answer("5", Boolean.FALSE));
                        add(new Answer("3", Boolean.FALSE));
                    }
                }));
                
                final Video video6 = new Video("http://www.videodetective.net/player.aspx?cmd=6&fmt=4&customerid=699923&videokbrate=2500&publishedid=218270",
                        new Question("What is Garth Brooks most successful album?", new ArrayList<Answer>() {

                    {
                        add(new Answer("Ropin' the Wind", Boolean.FALSE));
                        add(new Answer("No Fences", Boolean.FALSE));
                        add(new Answer("Double Live", Boolean.TRUE));
                        add(new Answer("Sevens", Boolean.FALSE));
                    }
                }));

                videos = new ArrayList<Video>(new ArrayList<Video>() {

                    {
                        add(video);
                        add(video2);
                        add(video3);
                        add(video4);
                        add(video5);
                        add(video6);
                    }
                });
           
        }        
    }
    
}
