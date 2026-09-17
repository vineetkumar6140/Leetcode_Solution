class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        // Start from the second-last row
        for (int i = triangle.size() - 2; i >= 0; i--) {

            for (int j = 0; j < triangle.get(i).size(); j++) {

                int left = triangle.get(i + 1).get(j);
                int right = triangle.get(i + 1).get(j + 1);

                int min = Math.min(left, right);

                int current = triangle.get(i).get(j);

                triangle.get(i).set(j, current + min);
            }
        }

        return triangle.get(0).get(0);
    }
}