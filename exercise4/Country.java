package exercise4;

import java.util.*;
import java.util.stream.Collectors;

public class Country implements Comparable<Country>{

    private static final int[] POINTS = {1,2,3,4,5,6,7,8,9,10,12};
    private String name;
    private String band;

    private Map<Country,Integer> pointsGot;
    private Map<Integer, Country> pointsReceived;

    public Country(String name, String band) {
        this.name = name;
        this.band = band;
        pointsGot = new HashMap<>();
        pointsReceived = new TreeMap<>();
    }

    public void getVotes(Integer points, Country country){
        pointsGot.put(country,points);
    }

    public void toVote(List<Country> countryList){
        Collections.shuffle(countryList);
        for(int point : POINTS)
            if (!(countryList.get(0).getName().equals(this.name)))
                pointsReceived.put(point, countryList.remove(0));

    }
    public int obtenerPuntuacionStreams(){
        return pointsGot.values().stream()
                .collect(Collectors.summingInt(Integer::intValue));
    }
    public int obtenerPuntuacionStreams2(){
        return pointsGot.values().stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    public int obtenerPuntuacionIterator(){
        int suma = 0;

        Iterator<Integer> iterator = pointsGot.values().iterator();
        while (iterator.hasNext())
            suma+=iterator.next();

        return suma;
    }
    public int obtenerPuntuacion(){
        int suma = 0;

        for(Integer punto : pointsGot.values())
            suma+=punto;

        return suma;
    }

    public String getName() {
        return name;
    }

    public String getBand() {
        return band;
    }

    public Map<Country, Integer> getPointsGot() {
        return pointsGot;
    }

    public Map<Integer, Country> getPointsReceived() {
        return pointsReceived;
    }

    @Override
    public int compareTo(Country o) {
        return name.compareToIgnoreCase(o.name);
    }


}
