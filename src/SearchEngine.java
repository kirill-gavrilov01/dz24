import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

// Основная логика поиска
public class SearchEngine {
    private Map<String, List<Result>> index;

    public SearchEngine(Map<String, List<Result>> index) {
        this.index = index;
    }

    /**
     * Поиск по запросу с фильтром и коллекцией в TreeSet
     */
    public TreeSet<Result> search(String query) {
        return index.getOrDefault(query, Collections.emptyList())
                .stream()
                .filter(Result::isRelevant)
                .collect(Collectors.toCollection(
                        () -> new TreeSet<>(new ResultComparator())));
    }
}
