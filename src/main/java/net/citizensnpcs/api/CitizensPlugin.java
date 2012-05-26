package net.citizensnpcs.api;

import java.io.File;

import net.citizensnpcs.api.attachment.AttachmentFactory;
import net.citizensnpcs.api.npc.NPCRegistry;

public interface CitizensPlugin {
    public File getDataFolder();

    /**
     * Gets the {@link NPCRegistry}.
     * 
     * @return The NPC registry
     */
    public NPCRegistry getNPCRegistry();

    public File getScriptFolder();

    public void onImplementationChanged();

    public AttachmentFactory getAttachmentFactory();
}
