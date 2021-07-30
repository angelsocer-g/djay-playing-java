package google.djay.djayplayingjava.clazz;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Djay {

    private String name;
    private String job;
    int age = 30;

    public Djay(){
        this.name = "정주";
        this.job = "개발자";
    }

    public Djay(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public Djay(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(super.toString()).append(System.lineSeparator());
        Field[] declaredFields = this.getClass().getDeclaredFields();
        for(Field f : declaredFields){
            try {
                sb.append(f.getName()).append("(").append(f.getClass()).append(")")
                        .append(" = ").append(f.get(this)).append(System.lineSeparator());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
