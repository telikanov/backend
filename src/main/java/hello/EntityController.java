package hello;

import static hello.EntityController.BASE_PATH;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value=EntityController.BASE_PATH)
@Api(value = "Server management")
public class EntityController {
    public final static String BASE_PATH = "server-management";

    @RequestMapping(method = RequestMethod.GET, path="/"+BASE_PATH+"/{id}")
    @ApiOperation(value = "getServerById")
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = Entity.class),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<Entity> getEntity(@PathVariable(value="id") Long id) {
        if (id == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(new Entity(id, "name verver", false), HttpStatus.OK);
    }
    
    
    @RequestMapping(method = RequestMethod.GET, path="/"+BASE_PATH+"/servers")
    @ApiOperation(value = "getServers")
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = Entity.class)
    })
    public ResponseEntity<List<Entity>> getEntities() {
        List<Entity> list = new ArrayList<>();
        list.add(new Entity((long)1, "gitlab", false));
        list.add(new Entity((long)2, "red mine", false));
        list.add(new Entity((long)3, "github", true));  
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
