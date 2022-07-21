package Produce;

import java.util.HashMap;
import java.util.Map;

public class ProduceStore<Produce> {

    private final  ProduceStore<Produce> instance = new ProduceStore<Produce>();
    public Map<Produce, Integer> foodStore;

    ProduceStore(){
        this.foodStore = new HashMap<>();

    }

    public ProduceStore<Produce> getInstance() {
        return instance;
    }

    public void add(Produce edible, Integer numberOfProduce){
        this.foodStore.put(edible, numberOfProduce);
    }

    public void remove(Produce edible) {
        this.foodStore.remove(edible);
    }

    public Integer getQuantityInStorage(Produce edible) {

        return this.foodStore.get(edible);
    }

    public Boolean contains(Produce edible){
        return this.foodStore.containsKey(edible);
    }




}
