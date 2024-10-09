package opsDash.specialAccess;

import java.util.Optional;

interface SpecialAccessRepository
{

    SARequest save(SARequest toSave);

    Optional<Integer> findHighestSARequestNumber();
}
