package handler;

import api.request;
import league_objects.match.MatchDto;
import org.json.JSONObject;

public class MatchHandler {
    private String url;


    public MatchHandler(String region) {
        this.url = "https://" + region + ".api.riotgames.com/lol/match/v4/matches/";
    }

    public MatchDto get_match_by_match_id(long matchId, String x_riot_token) throws Exception {
        request req = new request(x_riot_token);
        String url = this.url + matchId;
        JSONObject m = req.send(url);
        return new MatchDto(m);
    }

}
