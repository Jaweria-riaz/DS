class Node {
    String song;
    Node next;

    public Node(String song) {
        this.song = song;
        this.next = null;
    }
}

public class PlayList {
    public static void PlaySongs(char K, int N, Node head) {
        Node current = head;
        
        while (current != null) {
            if (current.song.charAt(0) == K) {
                // Play the song N times if it starts with the letter K
                for (int i = 0; i < N; i++) {
                    System.out.println("Playing: " + current.song);
                }
            } else {
                // Play the song once if it doesn't start with K
                System.out.println("Playing: " + current.song);
            }
            current = current.next; // Move to the next song
        }
    }

    public static void main(String[] args) {
        Node song1 = new Node("Umbrella");
        Node song2 = new Node("Toxic");
        Node song3 = new Node("Firework");
        Node song4 = new Node("Rehab");
        Node song5 = new Node("Blinding Lights");
        Node song6 = new Node("Hey Ya");
        Node song7 = new Node("UpTown Funk");
        Node song8 = new Node("Hello");

        song1.next = song2;
        song2.next = song3;
        song3.next = song4;
        song4.next = song5;
        song5.next = song6;
        song6.next = song7;
        song7.next = song8;

        // Playing songs with 'H' being played 4 times
        PlaySongs('H', 4, song1);
    }
}