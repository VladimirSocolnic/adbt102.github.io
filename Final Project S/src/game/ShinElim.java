package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class ShinElim implements CollisionListener {

    private Samurai game;
    public ShinElim (Samurai s){
        this.game = s;
    }


    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof Shinoby) {
            e.getOtherBody().destroy();
        }


    }



    }




