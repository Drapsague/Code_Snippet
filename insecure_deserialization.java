import java.io.*;

class MySafeObject implements Serializable {
    private static final long serialVersionUID = 1L;
    String data = "safe";
}

public class DeserializeTest {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(new MySafeObject());

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Object obj = in.readObject(); 
        System.out.println(((MySafeObject) obj).data);
    }
}

