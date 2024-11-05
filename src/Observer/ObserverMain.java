package Observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObserverMain {
    public static void main(String[] args) throws IOException {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber subscriber1 = new Subscriber("Harry Potter");
        Subscriber subscriber2 = new Subscriber("James Potter");

        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.notifyChanges("Learn Design Pattern");
        channel.notifyChanges("Learn Solid Principles");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Press 1 to upload video");
            System.out.println("Press 2 to subscribe");
            System.out.println("Press 3 to unsubscribe");
            System.out.println("Press 4 to exit");
            int c = Integer.parseInt(br.readLine());
            switch (c) {
                case 1: // Upload New Video
                    System.out.println("Enter Video Title");
                    String videoTitle = br.readLine();
                    channel.notifyChanges(videoTitle);
                    break;

                case 2: // Subscribe
                    System.out.println("Enter Name of Subscriber");
                    String sname = br.readLine();
                    Subscriber s1 = new Subscriber(sname);
                    channel.subscribe(s1);
                    break;
                case 3: // Unsubscribe--not working
                    System.out.println("Enter Name to Unsubscribe");
                    String usname = br.readLine();
                    Subscriber s2 = new Subscriber(usname);
                    channel.unsubscribe(s2);
                    break;
                case 4: // EXIT
                    System.out.println("Exiting..");
                    System.exit(0);
                    break;
            }
        }
    }
}
