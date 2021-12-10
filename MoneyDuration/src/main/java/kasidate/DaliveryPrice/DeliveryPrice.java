package kasidate.DaliveryPrice;

public class DeliveryPrice {
    private double weight;
    private double width1;
    private double width2;
    private double height;
    private double cost;
    private double weightCost;
    private double sizeCost;

    DeliveryPrice(double weight, double width1, double width2, double height){
        this.weight = weight;
        this.width1 = width1;
        this.width2 = width2;
        this.height = height;
    }
    public double Price(){
        if (weight > 0 && weight <= 5 ){
            weightCost = 85;
        } else if (weight <= 10){
            weightCost = 100;
        } else if (weight <= 15){
            weightCost = 140;
        } else if (weight <= 20){
            weightCost = 185;
        } else {weightCost = -1 ;}
        this.weightCost = weightCost;


        double size = width1*width2*height;
        if (size > 0 && size <= 60){
            sizeCost = 85;
        } else if (size <= 90){
            sizeCost = 100;
        } else if (size <= 120){
            sizeCost = 120;
        } else if (size <= 150){
            sizeCost = 185;
        } else { sizeCost = -1;}
        this.sizeCost = sizeCost;


        if (sizeCost == -1){
            cost = -1.00;
        } else if (weightCost == -1){
            cost = -1.00;
        } else if (sizeCost < weightCost){
            cost = weightCost;
        } else if (sizeCost > weightCost){
            cost = sizeCost;
        }
        this.cost = cost;
        return cost;
    }

    @Override
    public String toString() {
        return
                " weight : " + weight +
                "\n width 1 : " + width1 +
                "\n width 2 : " + width2 +
                "\n height : " + height +
                "\n cost by weight : " + weightCost +
                "      cost by size : " + sizeCost +
                "\n cost : " + cost ;
    }
}
