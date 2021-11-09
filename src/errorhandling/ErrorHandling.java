package errorhandling;

public class ErrorHandling {


    public static void validateVariable(String varName){
        try {
            System.out.println(varName);
            if(varName.startsWith("$")) throw new VariableStartWithIDolllarException("variable shouldnt start with dollar");
            else if(varName.startsWith("_")) throw new VariableStartWithIUnderscoreException("variable shouldnt start with underscore");
            else if(varName.matches("[0-9]+[a-zA-Z]*")) throw new VariableStartWithIntException("variable shouldnt start with a number");
            else if(varName == null) throw new NullPointerException("variable name cannot be null");
        }
        catch (VariableStartWithIDolllarException | VariableStartWithIntException
                | VariableStartWithIUnderscoreException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("variable cannot be null");
        }
        finally {
            System.out.println("It is finally block");
        }
    }

    public static void main(String[] args) {

        for(String s : new String[]{"1xyz", "_xyz", "$xyz", null}){
            validateVariable(s);
        }

    }
}
