
import java.util.ArrayList;
import java.util.List;

public class Movie extends Material {
    List<Person> actors = new ArrayList<>();
    Person director;

    Movie(int id, String name, List<Integer> scores, int release_year, Category category, String type, List<Person> actors, Person director) {
        super(id, name, scores, release_year, category, type);
        this.actors = actors;
        this.director = director;
    }

    void addActor(Person actor){
        this.actors.add(actor);
    }

    @Override
    void showDetail(){
        System.out.printf(this.name,this.scores,this.scores,this.release_year,this.category,this.price,this.type);

    }

    @Override
    double getAvgScore(){
        int sum = 0;
        double result;
        for(int s: scores){
            sum = sum + s;
        }
        int factor = this.scores.size();
        result = sum/factor;
        return result;
    }


}