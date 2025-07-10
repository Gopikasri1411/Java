public static List<List<Integer>> findCombinations(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(arr, target, new ArrayList<>(), result);
        return result;
    }
    private static void helper(int[] arr, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            current.add(arr[i]);
            helper(arr, target - arr[i], current, result);
            current.remove(current.size() - 1); // backtrack
        }
    }

