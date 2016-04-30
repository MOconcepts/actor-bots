package im.actor.bots

import im.actor.bots.framework.farm
import im.actor.bots.framework.traits.sharedBugSnagClient

fun main(args: Array<String>) {


    farm("NewFarm") {


        bot(EchoStatefulBot::class) {
            name = "newafri"
            token = "b3df5b8f0f00f717b4a318c4277608136c489562"
        }

    }
}