package in.arjsna.swipecardlib;

import androidx.annotation.IntDef;

import static in.arjsna.swipecardlib.FlingDirection.FLING_DIRECTION_UP;
import static in.arjsna.swipecardlib.FlingDirection.FLING_DIRECTION_DOWN;
import static in.arjsna.swipecardlib.FlingDirection.FLING_DIRECTION_LEFT;
import static in.arjsna.swipecardlib.FlingDirection.FLING_DIRECTION_RIGHT;
import static in.arjsna.swipecardlib.FlingDirection.FLING_DIRECTION_HORIZONTAL;
import static in.arjsna.swipecardlib.FlingDirection.FLING_DIRECTION_VERTICAL;
import static in.arjsna.swipecardlib.FlingDirection.FLING_DIRECTION_ALL;

/**
 * Created by BrookMG on 7/27/2019 in in.arjsna.swipecardlib
 * inside the project WedaJ .
 */

@IntDef(value = {FLING_DIRECTION_UP , FLING_DIRECTION_DOWN, FLING_DIRECTION_LEFT,
        FLING_DIRECTION_RIGHT, FLING_DIRECTION_HORIZONTAL, FLING_DIRECTION_VERTICAL,
        FLING_DIRECTION_ALL})
public @interface FlingDirection {
    int FLING_DIRECTION_UP = 0;
    int FLING_DIRECTION_DOWN = 1;
    int FLING_DIRECTION_LEFT = 2;
    int FLING_DIRECTION_RIGHT = 3;
    int FLING_DIRECTION_HORIZONTAL = 4;
    int FLING_DIRECTION_VERTICAL = 5;
    int FLING_DIRECTION_ALL = 6;
}
