package Handlers.CoordinationHandler;

import org.json.simple.JSONObject;

public class ResponseHandler {
    // Handle Responses From Leader

    // list - {"type" : allrooms, "allrooms": ["jokes", "room1"}
    // who

    // createroom - {"type": "createroom", "approved": "true"}
    // joinroom - {"type" : roomroute, "roomid": "jokes", "host" : "122.134.2.4", "port" : "4445"}

    // movejoin
    // deleteroom - {"type" : "deleteroom", "serverid" : "s1", "roomid" : "jokes"}
    @SuppressWarnings("unchecked")
    public JSONObject deleteRoomServerRespond(String serverID, String roomID){
        JSONObject newIdentity = new JSONObject();
        newIdentity.put("type", "deleteroom");
        newIdentity.put("serverid", serverID);
        newIdentity.put("roomid",roomID);
        return newIdentity;
    }

    // newidentity - {"type": "leadernewidentity",  “approved”: ”true”,  "identity": "Adel"}
    @SuppressWarnings("unchecked")
    public JSONObject sendNewIdentityServerResponse(String isAccepted, String clientIdentity){
        JSONObject newIdentity = new JSONObject();
        newIdentity.put("type", "leadernewidentity");
        newIdentity.put("approved", isAccepted);
        newIdentity.put("identity",clientIdentity);
        return newIdentity;
    }

}