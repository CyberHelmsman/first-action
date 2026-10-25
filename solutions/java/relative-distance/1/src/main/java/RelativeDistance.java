import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class RelativeDistance {
    private final Map<String, Set<String>> graph = new HashMap<>();

    RelativeDistance(Map<String, List<String>> familyTree) {
        for (Map.Entry<String, List<String>> entry : familyTree.entrySet()) {
            String parent = entry.getKey();
            List<String> children = entry.getValue();

            graph.putIfAbsent(parent, new HashSet<>());

            for (String child : children) {
                graph.putIfAbsent(child, new HashSet<>());
                graph.get(parent).add(child);
                graph.get(child).add(parent);
            }

            // Connect siblings directly (degree of separation = 1)
            for (int i = 0; i < children.size(); i++) {
                for (int j = i + 1; j < children.size(); j++) {
                    String child1 = children.get(i);
                    String child2 = children.get(j);
                    graph.get(child1).add(child2);
                    graph.get(child2).add(child1);
                }
            }
        }
    }

    int degreeOfSeparation(String personA, String personB) {
        if (!graph.containsKey(personA) || !graph.containsKey(personB)) {
            return -1;
        }

        if (personA.equals(personB)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> distances = new HashMap<>();

        queue.add(personA);
        distances.put(personA, 0);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            int currentDist = distances.get(current);

            if (current.equals(personB)) {
                return currentDist;
            }

            for (String neighbor : graph.get(current)) {
                if (!distances.containsKey(neighbor)) {
                    distances.put(neighbor, currentDist + 1);
                    queue.add(neighbor);
                }
            }
        }

        return -1;
    }
}