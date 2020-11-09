package cisclab5;

/*
Ada Maldonado

This program prints out into a file the mutliple songs played in the span of 4 weeks.
It takes them alphetically and displayes the song name, artist, and the average of
plays it produce in how many times it appeared each week.

*/

import java.io.File; //Used to identify the csv file
import java.util.Scanner; //Used to scan the csv files
import java.io.PrintStream; //Used to print output to a file

public class CISCLab5 {

    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream("output.txt"); //I created an output file

        //These 4 csv files will be used on the program
        Scanner sc = new Scanner(new File("regional-global-weekly-latest-11-05-20.csv"));
        Scanner sc2 = new Scanner(new File("regional-global-weekly-10-29-20.csv"));
        Scanner sc3 = new Scanner(new File("regional-global-weekly-10-22-20.csv"));
        Scanner sc4 = new Scanner(new File("regional-global-weekly-10-15-20.csv"));

        //I made an array for each song, artist, and there streams played
        String[] songs = new String[800];
        String[] artists = new String[800];
        int[] streams = new int[800];

        //Used to see how many times the song appears in the 4 weeks
        int[] songAppearance = new int[800];

        //Used to add up all thhe streams of one song
        int[] sumStreams = new int[800];

        int count = 0; //Counter of songs in the span of 4 weeks

        while (sc.hasNext()) { //checks a new line of song from the csv file
            //I found the song name by identifying where it would be
            String trackOfArtist = sc.nextLine();
            int firstComma = trackOfArtist.indexOf(",") + 1;
            String afterFirstComma = trackOfArtist.substring(firstComma);
            int secondComma = afterFirstComma.indexOf(",");
            String songName = afterFirstComma.substring(0, secondComma);

            //I found the artist name of a song
            String beginningOfArtistName = afterFirstComma.substring(secondComma + 1);
            int thirdComma = beginningOfArtistName.indexOf(",");
            String artistName = beginningOfArtistName.substring(0, thirdComma);

            //I found the number of streams played of a song
            String beginningOfStreams = beginningOfArtistName.substring(thirdComma + 1);
            int forthComma = beginningOfStreams.indexOf(",");
            String streamsPlayed = beginningOfStreams.substring(0, forthComma);

            //Initiallizes the first csv file to an array
            songs[count] = songName;
            artists[count] = artistName;
            streams[count] = Integer.parseInt(streamsPlayed);
            sumStreams[count] = Integer.parseInt(streamsPlayed);
            songAppearance[count]++;
            count++;
        }//end while

        while (sc2.hasNext()) { //checks the second csv file
            String trackOfArtist = sc2.nextLine();
            int firstComma = trackOfArtist.indexOf(",") + 1;
            String afterFirstComma = trackOfArtist.substring(firstComma);
            int secondComma = afterFirstComma.indexOf(",");
            String songName = afterFirstComma.substring(0, secondComma);

            String beginningOfArtistName = afterFirstComma.substring(secondComma + 1);
            int thirdComma = beginningOfArtistName.indexOf(",");
            String artistName = beginningOfArtistName.substring(0, thirdComma);

            String beginningOfStreams = beginningOfArtistName.substring(thirdComma + 1);
            int forthComma = beginningOfStreams.indexOf(",");
            String streamsPlayed = beginningOfStreams.substring(0, forthComma);

            //sees if the song is already in array from the previous csv file
            boolean songInArray = false;
            for (int j = 0; j < count; j++) {
                if (songName.equals(songs[j])) {
                    songAppearance[j]++;
                    sumStreams[j] = sumStreams[j] + Integer.parseInt(streamsPlayed);
                    songInArray = true;
                }//end if
            }//end for

            //if the song is not in the array already then it initiallizes into a new spot
            if (songInArray == false) {
                songs[count] = songName;
                artists[count] = artistName;
                streams[count] = Integer.parseInt(streamsPlayed);
                sumStreams[count] = Integer.parseInt(streamsPlayed);
                songAppearance[count]++;
                count++;
            }//end if
        }//end while

        while (sc3.hasNext()) { //third csv file
            String trackOfArtist = sc3.nextLine();
            int firstComma = trackOfArtist.indexOf(",") + 1;
            String afterFirstComma = trackOfArtist.substring(firstComma);
            int secondComma = afterFirstComma.indexOf(",");
            String songName = afterFirstComma.substring(0, secondComma);

            String beginningOfArtistName = afterFirstComma.substring(secondComma + 1);
            int thirdComma = beginningOfArtistName.indexOf(",");
            String artistName = beginningOfArtistName.substring(0, thirdComma);

            String beginningOfStreams = beginningOfArtistName.substring(thirdComma + 1);
            int forthComma = beginningOfStreams.indexOf(",");
            String streamsPlayed = beginningOfStreams.substring(0, forthComma);

            //sees if the song is already in array from the previous csv files
            boolean songInArray = false;
            for (int j = 0; j < count; j++) {
                if (songName.equals(songs[j])) {
                    songAppearance[j]++;
                    sumStreams[j] = sumStreams[j] + Integer.parseInt(streamsPlayed);
                    songInArray = true;
                }//end if
            }//end for

            if (songInArray == false) {
                songs[count] = songName;
                artists[count] = artistName;
                streams[count] = Integer.parseInt(streamsPlayed);
                sumStreams[count] = Integer.parseInt(streamsPlayed);
                songAppearance[count]++;
                count++;
            }//end if
        }//end while

        while (sc4.hasNext()) { //last csv file checked
            String trackOfArtist = sc4.nextLine();
            int firstComma = trackOfArtist.indexOf(",") + 1;
            String afterFirstComma = trackOfArtist.substring(firstComma);
            int secondComma = afterFirstComma.indexOf(",");
            String songName = afterFirstComma.substring(0, secondComma);

            String beginningOfArtistName = afterFirstComma.substring(secondComma + 1);
            int thirdComma = beginningOfArtistName.indexOf(",");
            String artistName = beginningOfArtistName.substring(0, thirdComma);

            String beginningOfStreams = beginningOfArtistName.substring(thirdComma + 1);
            int forthComma = beginningOfStreams.indexOf(",");
            String streamsPlayed = beginningOfStreams.substring(0, forthComma);

            boolean songInArray = false;
            for (int j = 0; j < count; j++) {
                if (songName.equals(songs[j])) {
                    songAppearance[j]++;
                    sumStreams[j] = sumStreams[j] + Integer.parseInt(streamsPlayed);
                    songInArray = true;
                }//end if
            }//end for

            if (songInArray == false) {
                songs[count] = songName;
                artists[count] = artistName;
                streams[count] = Integer.parseInt(streamsPlayed);
                sumStreams[count] = Integer.parseInt(streamsPlayed);
                songAppearance[count]++;
                count++;
            }//end if
        }//end while

        //finds the average # of streams played in the span of their appearances each week
        int[] averageStreams = new int[800];
        for (int l = 0; l < count; l++) {
            averageStreams[l] = sumStreams[l] / songAppearance[l];
        }//end for

        //sorts the song in alphetical order
        String temp;
        String tempArtist;
        int tempAvgStream;
        ps.printf("%-35s %-22s %10s %n", "Title Name", "Artist", "Average # of Streams");
        for (int j = 0; j < count; j++) {
            for (int k = j + 1; k < count; k++) {
                if (songs[k].compareToIgnoreCase(songs[j]) < 0) {
                    temp = songs[j];
                    tempArtist = artists[j];
                    tempAvgStream = averageStreams[j];

                    songs[j] = songs[k];
                    artists[j] = artists[k];
                    averageStreams[j] = averageStreams[k];

                    songs[k] = temp;
                    artists[k] = tempArtist;
                    averageStreams[k] = tempAvgStream;
                }//end if
            }//end for
            ps.printf("%-35s %-25s %10d %n", songs[j], artists[j], averageStreams[j]);
        }//end for
    }//end main
}//end class
