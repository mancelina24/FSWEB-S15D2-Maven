package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks ;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }
    public Set<Task> getTasks(String name) {
        switch (name.toLowerCase()) {
            case "ann":
                return annsTasks;
            case "bob":
                return bobsTasks;
            case "carol":
                return carolsTasks;
            case "unassigned":
                return unassignedTasks;
            case "all":
                Set<Task> allTasks = new HashSet<>();
                allTasks.addAll(annsTasks);
                allTasks.addAll(bobsTasks);
                allTasks.addAll(carolsTasks);
                return allTasks;
            default:
                return new HashSet<>();
        }
    }

    public Set<Task> getUnion(Set<Task> set1, Set<Task> set2){
        Set<Task> union = new HashSet<>();

        union.addAll(set1);
        union.addAll(set2);

        return union;
    }
    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2){
        Set<Task> set1Copy = new HashSet<>(set1);

        set1Copy.retainAll(set2);
        return set1Copy;
    }
    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2){
        Set<Task> set1Copy = new HashSet<>(set1);

        set1Copy.removeAll(set2);
        return set1Copy;
    }


}
