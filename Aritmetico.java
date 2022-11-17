public class Aritmetico extends SimpleProcess{
    protected int id;
    
    public Aritmetico(int id){
        super(id);
    
    }
    @Override
    public void aritmetico(){
        if(this.id == 1){
            this.id = 1;
        }
        else{
            this.id = 0;
        }

    }

}