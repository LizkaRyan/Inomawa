package mg.tana.inomawa.dto;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import mg.tana.inomawa.utils.POV;

@Getter
@Setter
@JsonView(POV.Public.class)
public class ResponseJson<T> {

    private int code;

    private String message;

    private T data;

    public ResponseJson(int code,String message){
        this.code=code;
        this.message=message;
    }

    public ResponseJson(int code,String message,T data){
        this.code=code;
        this.message=message;
        this.data=data;
    }
}
