package boseapi;

import org.json.JSONObject;

/**
 * Bose SoundTouch API
 **/

public class Main {

    public static void main(String[] args) throws Exception {

        BoseSoundTouch boseSoundTouch = new BoseSoundTouch();

        JSONObject volume = boseSoundTouch.getVolume();

        System.out.println("Current Volume is : " + volume);

        JSONObject bass = boseSoundTouch.getBass();
        System.out.println("Current Bass is : " + bass);

        JSONObject now_playing = boseSoundTouch.getNowPlaying();
        System.out.println("Now Playing : " + now_playing);

        JSONObject bassCapabilities = boseSoundTouch.getBassCapabilities();
        System.out.println("Bass Capabilities : " + bassCapabilities);

        JSONObject presets = boseSoundTouch.getPresets();
        System.out.println("Presets : " + presets);

//        JSONObject source = boseSoundTouch.getSource();
//        System.out.println("Get Sources : " + source);
//
//        JSONObject getGroup = boseSoundTouch.getGroup();
//        System.out.println("Get Group : " + getGroup);
    }
}