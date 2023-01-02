class Solution {
  public int kthFactor(int n, int k) {
    Set<Integer> setFactors = new HashSet<Integer>();
    int upperBound = n;
    int i = 1;
    while (i <= upperBound) {
      if (n % i == 0) {
        setFactors.add(i);
        upperBound = n / i;
        setFactors.add(upperBound);
      }
      i++;
    }
    List<Integer> listFactors = new ArrayList<>(setFactors);
    Collections.sort(listFactors);
    if (listFactors.size() < k) {
      return -1;
    }
    return listFactors.get(k - 1);
  }
}