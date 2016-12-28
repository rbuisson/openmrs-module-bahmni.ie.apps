package org.openmrs.module.bahmniIEApps.dao;

import org.openmrs.Form;
import org.openmrs.api.db.DAOException;

import java.util.List;

public interface BahmniFormDao {
    List<Form> getAllForms(String formName, boolean includeRetired, boolean includeDraftState) throws DAOException;
    List<Form> getDraftFormByName(String name) throws DAOException;
    List<Form> getAllPublishedForms(boolean includeRetired) throws DAOException;
}