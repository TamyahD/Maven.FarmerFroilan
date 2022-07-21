package Produce;

import java.util.HashMap;
import java.util.Map;

public class ProduceStore {

    private static final ProduceStore instance = new ProduceStore();
    public Map<Produce<Edible>, Integer> foodStore;

    ProduceStore(){
        this.foodStore = new HashMap<>();
    }

    public static ProduceStore getInstance() {
        return instance;
    }

    public void add(Produce<Edible> edible, Integer numberOfProduce){
        // check if produce in the keyset
        if (foodStore.containsKey(edible)) {
            foodStore.put(edible, numberOfProduce + foodStore.get(edible));
        } else {
            // if not, put like below
            foodStore.put(edible, numberOfProduce);
        }
    }

    public void add(Produce<Edible> edibleProduce){
        add(edibleProduce, 1);
    }

    public void remove(Produce<Edible> edible) {
        this.foodStore.remove(edible);
    }

    public Integer getQuantityInStorage(Produce<Edible> edible) {

        return this.foodStore.get(edible);
    }

    public Boolean contains(Produce<Edible> edible){
        return this.foodStore.containsKey(edible);
    }




}
