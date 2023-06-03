<template>

    <v-card outlined>
        <v-card-title>
            UpdateVehicleStatus
        </v-card-title>

        <v-card-text>
            <String label="VehicleId" v-model="value.vehicleId" :editMode="editMode"/>
            <String label="Status" v-model="value.status" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="updateVehicleStatus"
            >
                UpdateVehicleStatus
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'UpdateVehicleStatusCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.vehicleId = '';
            this.value.status = '';
        },
        watch: {
        },
        methods: {
            updateVehicleStatus() {
                this.$emit('updateVehicleStatus', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

