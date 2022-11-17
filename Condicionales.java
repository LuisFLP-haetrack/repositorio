public class Condicionales extends SimpleProcess{
    protected int id;
    
    public Condicionales(int id){
        super(id);

    }
    @Override
    public void condicionales(){
        if(this.id == 3){
            this.id = 3;
        }
        else{
            this.id = 0;
        }
        
    }
}