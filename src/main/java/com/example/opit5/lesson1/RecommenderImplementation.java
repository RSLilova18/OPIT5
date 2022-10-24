package io.datajek.spring.basics.movierecommendersystem.lesson1;
import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
public class RecommenderImplementation {
    private Filter filter;
    public String[] recommendMovies(String movies) {
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }

    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }




}package io.datajek.spring.basics.movierecommendersystem.lesson1;
        import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
public class RecommenderImplementation {
    private Filter filter;
    public String[] recommendMovies(String movies) {
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }

    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }




}