import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

//-----------------------Clase Game-----------------------
class Game{
    private String name;
    private String category;
    private int price;
    private int quality;

    public Game(String name, String category, int price, int quality){
        this.name = name;
        this.category = category;
        this.price = price;
        this.quality = quality;
    }
    //Métodos Getters
    public String getName(){ return this.name; }
    public String getCategory(){ return this.category; }
    public int getPrice(){ return this.price; }
    public int getQuality(){ return this.quality; }

    //Creo que no son necesarios los sets, pero los dejaré por si acaso, después se borran en caso de no usarse

    public void setName(String name){ this.name = name; }
    public void setCategory(String category){ this.category = category; }
    public void setPrice(int price){ this.price = price; }
    public void setQuality(int quality){ this.quality = quality; }

}
//-----------------------Clase Dataset-----------------------

class Dataset{
    private ArrayList<Game> data;
    private String sortedByAtribute;

    public Dataset (ArrayList<Game> data){
        this.data = data;
        this.sortedByAtribute = "ninguno";
    }



    public ArrayList<Game> getGamesByPricebinary(int price){}
Arraylist<Game> result = newArraylist<>();
if(sortedByAtribute.equals("price"){
int left = 0, right = data.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midPrice = data.get(mid).getPrice();

            if (midPrice == price) {
                int i = mid;
                while (i >= 0 && data.get(i).getPrice() == price) {
                    result.add(0, data.get(i));
                    i--;
                }
                i = mid + 1;
                while (i < data.size() && data.get(i).getPrice() == price) {
                    result.add(data.get(i));
                    i++;
                }
                break;
            } else if (midPrice < price) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    } else {
        for (Game g : data) {
            if (g.getPrice() == price) {
                result.add(g);
            }
        }
    }

    return result;
}




    public ArrayList<Game> getGamesByPriceRange(int lowerPrice, int higherPrice){} //No sé qué tipo de dato debe ir, lo dejo así por mientras

    public ArrayList<Game> getGamesByCategory(String category){}

    public ArrayList<Game> getGamesByQuality(int quality){}

    public void sortByAlgorithm(String algorithm, String attribute){}

}
//------------------------Clase GenerateData-----------------------
class GenerateData{

}

//-----------------------Main------------------------

public class Main {

    public static void main(String[] args) {


    }
}
