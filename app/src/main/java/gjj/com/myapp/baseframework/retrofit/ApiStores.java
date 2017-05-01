package gjj.com.myapp.baseframework.retrofit;

import gjj.com.myapp.model.MainModel;
import gjj.com.myapp.model.Tutor;
import gjj.com.myapp.model.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by 高娟娟 on 2017/4/7.
 */

public interface ApiStores {
    //baseUrl
    String API_SERVER_URL = "http://115.159.195.172:8080/bysj3/";

//    @POST("login.json")
//    Observable<Tutor> loadLoginData(@Body User user);
//    @POST("login.json")
//    Call<String> loadLoginData(@Body User user);
    @POST("login.json")
    Observable<String> loadLoginData(@Body User user);

    @POST("getProjectAndReplyByTutor.json")
    Observable<String> loadProjectAndReply(@Header("tutorId") String tutorId);


}
