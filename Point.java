/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author
 */
public class Point {

    private Integer id;
    private Float latitude;
    private Float longitude;

    public Point(int id, float latitude, float longitude) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Point [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude;
    }

    public int getId() {
        return id;
    }
    public float getLatitude() {
        return latitude;
    }
    public float getLongitude() {
        return longitude;
    }

}

