import java.util.*;
import java.util.stream.Collectors;

// Класс Result с полем isRelevant(), которое проверяет релевантность документа
class Result implements Comparable<Result> {
    private final String documentId;
    private boolean relevant;

    public Result(String id, boolean rel) {
        this.documentId = id;
        this.relevant = rel;
    }

    public boolean isRelevant() {
        return relevant;
    }

    @Override
    public int compareTo(Result other) {
        return this.documentId.compareTo(other.documentId); // простой пример сравнения документов
    }
}

// Компаратор для сортировки результатов
class ResultComparator implements Comparator<Result> {
    @Override
    public int compare(Result r1, Result r2) {
        return r1.compareTo(r2);
    }
}

