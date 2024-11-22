class PasswordGenerator{
    private String prefix;
    private static int count = 0;
    private int randN;
    private int passN = 0;
    public PasswordGenerator(int n, String pre){
        prefix = pre;
        randN =  n;
    }
    public int pwCount(){
        return count;
    }
    public String pwGen(){
        String genp = prefix + ".";
        passN +=1;
        count ++;
        for(int i = randN; i>0; i--){
            int num = (int)(Math.random()*10);
            genp = genp + num;
        }
        return genp;
    }
    public PasswordGenerator(int r){
        prefix = "A";
        randN = r;
    }
    public static void main(String[]args){
        PasswordGenerator uno = new PasswordGenerator(5, "elfa");
        PasswordGenerator dos = new PasswordGenerator(3);
        System.out.println(uno.pwGen());
        System.out.println(uno.pwCount());
        System.out.println(dos.pwGen());
        System.out.println(dos.pwCount());

    }
}