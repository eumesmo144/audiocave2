package br.edu.ifpb.pweb2.audiocave;

public interface State {
    void play(Player player);
    void stop(Player player);
    void next(Player player);
    void previous(Player player);
}