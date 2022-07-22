package Produce;

import java.util.HashMap;
import java.util.Map;

public class ProduceStore {

    private static final ProduceStore instance = new ProduceStore();
    public Map<Edible, Integer> foodStore;

    ProduceStore(){
        this.foodStore = new HashMap<>();
    }

    public static ProduceStore getInstance() {
        return instance;
    }

    public void add(Edible edible, Integer numberOfProduce){
        // check if produce in the keyset
        if (foodStore.containsKey(edible)) {
            foodStore.put(edible, numberOfProduce + foodStore.get(edible));
        } else {
            // if not, put like below
            foodStore.put(edible, numberOfProduce);
        }
    }

    public void add(Edible edibleProduce){
        add(edibleProduce, 1);
    }

    public void remove(Edible edible) {
        this.foodStore.remove(edible);
    }

    public Integer getQuantityInStorage(Edible edible) {

        return this.foodStore.get(edible);
    }

    public Boolean contains(Edible edible){
        return this.foodStore.containsKey(edible);
    }


}
