public class Iterativos extends SimpleProcess{
    protected int id;

    public Iterativos(int id){
        super(id);
    }

    @Override
    public void iterativos(){
        if(this.id == 4){
            this.id = 4;
        }
        else{
            this.id = 0;
        }
    }


}