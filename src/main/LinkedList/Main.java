package main.LinkedList;

public class Main {
    public static void main(String[] args) {
        RecentlyPlayedStore store = new RecentlyPlayedStore(3);

        store.addSong("user1", "S1");
        store.addSong("user1", "S2");
        store.addSong("user1", "S3");
        System.out.println(store.getPlaylist("user1"));  // Output: [S3, S2, S1]

        store.addSong("user1", "S4");
        System.out.println(store.getPlaylist("user1"));  // Output: [S4, S2, S3]

        store.addSong("user1", "S2");
        System.out.println(store.getPlaylist("user1"));  // Output: [S2, S4, S3]

        store.addSong("user1", "S1");
        System.out.println(store.getPlaylist("user1"));  // Output: [S1, S2, S4]
    }
}
