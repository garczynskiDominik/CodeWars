package src.main.java.rekrutacje.sabre;

import java.util.*;
import java.util.stream.Collectors;

public class CarProducer {
    private List<Model> models;

    public List<Model> getModels() {
        return models;
    }
}


class Model {
    private String color;
    private String bodyType; //SEDAN, PICKUP, VAN etc.

    public String getColor() {
        return color;
    }

    public String getBodyType() {
        return bodyType;
    }
}


class CarApplication {

    Collection<String> getUniqueSedanColors(List<CarProducer> producers) {

        List<List<Model>> listOfModeluniqueColor = producers.stream()
                .map(x -> x.getModels())
                .collect(Collectors.toList());

        List<Model> modelList = listOfModeluniqueColor.stream()
                .flatMap(x -> x.stream())
                .filter(y -> y.getBodyType().equals("SEDAN"))
                .collect(Collectors.toList());

        Set<String> uniqueColor = modelList.stream()
                .map(x -> x.getColor())
                .collect(Collectors.toSet());

        return uniqueColor;
    }
}