package main.LinkedList;

import java.util.*;

class RecentlyPlayedStore {
    private int capacity;
    private Map<String, Deque<String>> userPlaylists;

    public RecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        this.userPlaylists = new HashMap<>();
    }

    public void addSong(String userId, String songId) {
        if (!userPlaylists.containsKey(userId)) {
            userPlaylists.put(userId, new LinkedList<>());
        } else if (userPlaylists.get(userId).contains(songId)) {
            userPlaylists.get(userId).remove(songId);
        }
        userPlaylists.get(userId).addFirst(songId);
        if (userPlaylists.get(userId).size() > capacity) {
            userPlaylists.get(userId).removeLast();
        }
    }

    public List<String> getPlaylist(String userId) {
        if (!userPlaylists.containsKey(userId)) {
            return new ArrayList<>();
        }
        return new ArrayList<>(userPlaylists.get(userId));
    }
}


