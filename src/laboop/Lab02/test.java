
package laboop.Lab02;

import java.util.ArrayList;
import java.util.List;
import laboop.Lab02.aims.media.CompactDisc;
import laboop.Lab02.aims.media.Media;
import laboop.Lab02.aims.media.Track;

/**
 *
 * @author Admin
 */
public class test {
     public static void main(String[] args) {
        // Creating a list of tracks for the CD
        ArrayList<Track> trackList = new ArrayList<>();
        trackList.add(new Track("Track 1", 4));
        trackList.add(new Track("Track 2", 3));
        trackList.add(new Track("Track 3", 5));

        // Creating a new CD object
        CompactDisc cdExample = new CompactDisc(
                "hai",
                trackList,
                1,
                "Awesome Album",
                2,
                "Artist Name",
                "Director Name",
                
                19.99f
        );
        
        CompactDisc cdExample2 = new CompactDisc(
                "ha2i",
                trackList,
                11,
                "1Awesome Album",
                22,
                "1Artist Name",
                "D2irector Name",
                
                29.99f
        );
        
        // Displaying the CD information using toString
        Media md = (Media)cdExample;
        System.out.println(cdExample.toString());
        Cart cart = new Cart();
        cart.addMedia(cdExample);
        cart.addMedia(cdExample2);
        cart.prin();
         System.out.println(cart.totalCost());
    }
}
