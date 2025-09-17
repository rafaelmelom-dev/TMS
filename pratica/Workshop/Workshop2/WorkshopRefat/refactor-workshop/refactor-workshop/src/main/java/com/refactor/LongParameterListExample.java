
package com.refactor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * EXERCÍCIO: Code Smell - Long Parameter List
 * Objetivo:
 *  - Introduce Parameter Object: criar MeetingOptions e substituir a lista longa
 * Critério de aceite:
 *  - Método com até 3 parâmetros
 */
public class LongParameterListExample {

    // TODO: transformar esta assinatura usando um objeto de parâmetros.
    // FIZ COMO SUGERIDO, MAS NÃO ENTENDI A SOLUÇÃO
    public String scheduleMeeting(String title, MeetingDetails meetingDetails) {
        String mode = meetingDetails.online ? ("ONLINE (" + meetingDetails.meetingLink + ")") : ("ROOM " + meetingDetails.room);
        return "%s on %s from %s to %s, %s, participants=%d"
                .formatted(title, meetingDetails.date, meetingDetails.start, meetingDetails.end, mode, meetingDetails.participants.size());
    }

    public Record MeetingDetails(LocalDate date, LocalTime start, LocalTime end,
                                 String room, boolean online, String meetingLink,
                                 List<String> participants) {}

}
