public class StringBox {
 
  private char[] characters;

  public StringBox(String s){
    characters = new char[s.length()];
    for(int i = 0; i < s.length(); i++){
       this.characters[i] = s.charAt(i);
    }
  }

  public void setCharacters(String s){

  }
 
  public String toString(){
    return String.valueOf(this.characters);
  }

  public boolean isEmpty(){
    return characters == null || this.characters.length == 0 ? true : false;
  }

  public int length(){
    return this.characters.length;
  }

  public StringBox concat(String str){
    int j = 0;
    char[] temp = new char[this.characters.length + str.length()+1];
    for(int i = 0; i < this.characters.length; i++){
       temp[j++] = this.characters[i];
    }
    for(int i = 0; i < str.length(); i++){
       temp[j++] = str.charAt(i);
    }
    // this.characters = temp;
    //return this;
    return new StringBox(String.valueOf(temp));
  }

  public StringBox replace(char from, char to){
    return null;
  }

  public StringBox replace(String from, String to){
    return null;
  }

  public static void main(String[] args) {
    StringBox s = new StringBox("Hello");
    System.out.println(s.toString());
    System.out.println(s.isEmpty());
    s.concat("World");
    System.out.println(s.toString());
    System.out.println(s.concat("World"));
    
  }
}
