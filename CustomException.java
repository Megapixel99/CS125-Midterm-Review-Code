public class CyNotFoundException extends FileAlreadyExistException {
  
  public String exception = "Memed";
  
  public CyNotFoundException() {
    super();
    exception = "Where is he?";
  }
  
  public CyNotFoundException(String exc) {
    super();
    exception = exc;
  }

}
