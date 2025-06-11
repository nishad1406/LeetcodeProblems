class Solution {
    List<Integer> list;

    public List<Integer> lexicalOrder(int n) {

        list = new ArrayList<>();
        for(int i=1;i<=9;i++){
            recursions(i, n);
        }
        return list;
    }

    public void recursions(int v, int n){
        if(v>n){
            return;
        }
        list.add(v);
        for(int i=0;i<=9;i++){
            recursions(10*v+i,n);
        }
    }
}