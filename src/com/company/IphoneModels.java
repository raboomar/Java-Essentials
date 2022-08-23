package com.company;

public enum IphoneModels {
    IPHONE_SE("Iphone SE"),
    IPHONE_7("Iphone 7"),
    IPHONE_X("Iphone X");

    private String model;

    IphoneModels(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
