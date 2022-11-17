public class InputOutput extends SimpleProcess{
    protected int id;

    public InputOutput(int id){
        super(id);

    }
    @Override
    public void inputoutput(){
        if(this.id == 2){
            this.id = 2;
        }
        else{
            this.id = 0;
        }

    }

}