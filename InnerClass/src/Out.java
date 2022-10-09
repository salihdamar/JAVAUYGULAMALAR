public class Out {
    public String str="Out sınıfına ait değişken";
    public void OutRun(){
        In in=new In();
        in.inRun();

    }

    public class In{
        public String str="In sınıfına ait değişken";
        public void  inRun(){
            String str="In sınıfındaki run metoduna ait değişken";
            System.out.println(str);
            System.out.println(this.str);
            System.out.println(Out.this.str);
        }
    }
}
