package br.edu.ifpb.pweb2.audiocave;

public class PlayingState implements State {
    @Override
    public void play(Player player) {
        player.setPlaying(false);
        player.changeState(new ReadyState());
    }

    @Override
    public void stop(Player player) {
        player.setPlaying(false);
        player.changeState(new lockedState());
    }

    @Override
    public void next(Player player) {
        player.nextTrack();
    }

    @Override
    public void previous(Player player) {
        player.previousTrack();
    }
}